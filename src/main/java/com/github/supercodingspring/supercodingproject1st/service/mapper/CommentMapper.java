package com.github.supercodingspring.supercodingproject1st.service.mapper;

import com.github.supercodingspring.supercodingproject1st.repository.entity.Comment;
import com.github.supercodingspring.supercodingproject1st.web.dto.CommentResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CommentMapper {
    public CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    @Mapping(target = "post_id", source = "post.id")
    @Mapping(target = "created_at", source = "createdAt")
    CommentResponseDto CommentToCommentResponseDto(Comment comment);
}
