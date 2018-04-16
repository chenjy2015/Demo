package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.comment.mine.CommentMineItemBean;
import com.kye.model.bean.comment.mine.RequestCommentMineList;
import com.kye.model.bean.comment.notice.CommentAddItem;
import com.kye.model.bean.comment.notice.CommentItemBean;
import com.kye.model.bean.comment.notice.CommentSecurity;
import com.kye.model.bean.comment.notice.MyCommentUnReadList;
import com.kye.model.bean.comment.notice.RequestAddComment;
import com.kye.model.bean.comment.notice.RequestCommentList;
import com.kye.model.bean.comment.notice.RequestDeleteComment;
import com.kye.model.bean.comment.notice.RequestUnReadList;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 11/01/2018
 * @updated : 11/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public interface CommentService {

    // 我的评论
    @Headers({"method:OpenApi_Admin_QueryMyCommentInfoList"})
    @POST("router/rest")
    Single<OpenApiResult<List<CommentMineItemBean>>> getMyCommentList(@Body RequestCommentMineList requestCommentMineList);

    // 通知中心获取评论列表
    @Headers({"method:OpenApi_QueryCommentManagerList"})
    @POST("router/rest")
    Single<OpenApiResult<List<CommentItemBean>>> getCommentList(@Body RequestCommentList requestCommentList);

    // 通知中心添加评论
    @Headers({"method:OpenApi_insertCommentManager"})
    @POST("router/rest")
    Single<OpenApiResult<CommentAddItem>> insertComment(@Body RequestAddComment requestAddComment);

    // 评论删除权限验证接口
    @Headers({"method:my_deleteComment"})
    @POST("router/rest")
    Single<OpenApiResult<CommentSecurity>> deleteComment(@Body RequestDeleteComment requestDeleteComment);


    // 获取未读评论数
    @Headers({"method:OpenApi_Admin_GetReplMyCommentUnReadNum"})
    @POST("router/rest")
    Single<OpenApiResult<List<MyCommentUnReadList>>> getReplMyCommentUnReadList(@Body RequestUnReadList requestUnReadList);

}
