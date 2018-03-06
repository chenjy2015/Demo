package com.android.volley.toolbox;

import java.math.BigInteger;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class HTTPSTrustManager implements X509TrustManager {

    private static TrustManager[] trustManagers;
    private static final X509Certificate[] _AcceptedIssuers = new X509Certificate[]{};

    private static String PUB_KEY = "30820122300d06092a864886f70d01010105000382010f003082010a0282010100a4c596a7ef8486831b0b8b07fe7f6174cfa14e8c54de04872b4043f07b1b78a778a6d1b5c3770c0289f33f1e8b95ca74c1f996f0cd3a8a112ad01cc1e0228194981a3933fee1e8094507f7b92806e1793927a9a5528ae47d54827716637ca6155c9dc10fd88aca0bb6ba6197dd64a82fe5044072d990bc9ec8df361d1e4c8314590e5703891ba4d4e1f163b59511793f51416191e5ed8574936c1a8bf66cc8be7db9625219dfd86b9ca0dbe8e8219ff753bbb3c8f15b6eaab469dfe0e12f1f8735ce277c500f69a05b4db8c52235b0088157c3c45a78b8f0ef6e548e004f745568a12f9f1191799e279f4aed3560add7e7367ee1c3deb04b80e93d66a3e221550203010001";


    public SSLSocketFactory getKyeSSLSocketFactory() {
        SSLContext context = null;
        if (trustManagers == null) {
            trustManagers = new TrustManager[]{new HTTPSTrustManager()};
        }

        try {
            context = SSLContext.getInstance("TLS");
            context.init(null, trustManagers, new SecureRandom());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return context.getSocketFactory();
    }

    public boolean isClientTrusted(X509Certificate[] chain) {
        return true;
    }

    public boolean isServerTrusted(X509Certificate[] chain) {
        return true;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {

    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        if (chain == null) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
        }

        if (!(chain.length > 0)) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate is empty");
        }

        if (!(null != authType && authType.equalsIgnoreCase("ECDHE_RSA"))) {
            throw new CertificateException("checkServerTrusted: AuthType is not RSA");
        }

        // Perform customary SSL/TLS checks
        try {
            TrustManagerFactory tmf = TrustManagerFactory.getInstance("X509");
            tmf.init((KeyStore) null);

            for (TrustManager trustManager : tmf.getTrustManagers()) {
                ((X509TrustManager) trustManager).checkServerTrusted(chain, authType);
            }
        } catch (Exception e) {
            throw new CertificateException(e);
        }

        // Hack ahead: BigInteger and toString(). We know a DER encoded Public Key begins
        // with 0x30 (ASN.1 SEQUENCE and CONSTRUCTED), so there is no leading 0x00 to drop.
        RSAPublicKey pubkey = (RSAPublicKey) chain[0].getPublicKey();
        String encoded = new BigInteger(1 /* positive */, pubkey.getEncoded()).toString(16);

        // Pin it!
        final boolean expected = PUB_KEY.equalsIgnoreCase(encoded);
        if (!expected) {
            throw new CertificateException("expected is error ");
        }
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return _AcceptedIssuers;
    }

    public static void allowAllSSL() {

        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {

            @Override
            public boolean verify(String arg0, SSLSession arg1) {
                // TODO Auto-generated method stub  
                return true;
            }

        });

        SSLContext context = null;
        if (trustManagers == null) {
            trustManagers = new TrustManager[]{new HTTPSTrustManager()};
        }

        try {
            context = SSLContext.getInstance("TLS");
            context.init(null, trustManagers, new SecureRandom());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }

        HttpsURLConnection.setDefaultSSLSocketFactory(context
                .getSocketFactory());
    }

}
