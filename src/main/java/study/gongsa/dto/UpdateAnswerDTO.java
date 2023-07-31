package study.gongsa.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UpdateAnswerDTO {
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request{
        @ApiModelProperty(value="수정하고자 하는 답변글 UID")
        @NotNull(message = "답변글 UID는 필수값 입니다.")
        private int answerUID;
        @ApiModelProperty(value="변경하고자 하는 답변 내용")
        @NotBlank(message = "답변 내용은 필수값입니다.")
        @Size(min = 1, message = "답변 내용은 한글자 이상이어야 합니다.")
        private String content;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response{
        @ApiModelProperty(value="생성된 질문글 UID")
        private int questionUID;
    }
}

