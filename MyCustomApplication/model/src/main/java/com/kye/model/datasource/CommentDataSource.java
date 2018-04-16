package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
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
import com.kye.model.service.CommentService;

import java.util.List;

import io.reactivex.Single;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 11/01/2018
 * @updated : 11/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class CommentDataSource {

    private CommentService service;

    public CommentDataSource() {
        service = RetrofitManager.getInstance().createOpenApiService(CommentService.class);
    }

    public Single<OpenApiResult<List<CommentMineItemBean>>> getMyCommentList(RequestCommentMineList requestCommentMineList) {
        return service.getMyCommentList(requestCommentMineList);
    }

    public Single<OpenApiResult<List<CommentItemBean>>> getCommentList(RequestCommentList requestCommentList) {
        return service.getCommentList(requestCommentList);
    }

    public Single<OpenApiResult<CommentAddItem>> insertComment(RequestAddComment requestAddComment) {
        return service.insertComment(requestAddComment);
    }

    public Single<OpenApiResult<CommentSecurity>> deleteComment(RequestDeleteComment requestDeleteComment) {
        return service.deleteComment(requestDeleteComment);
    }

    public Single<OpenApiResult<List<MyCommentUnReadList>>> getReplMyCommentUnReadList(RequestUnReadList requestUnReadList) {
        return service.getReplMyCommentUnReadList(requestUnReadList);
    }
}
