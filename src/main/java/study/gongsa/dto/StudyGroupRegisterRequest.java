package study.gongsa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@ApiModel(value="StudyGroupRegisterRequest", description = "스터디 그룹 가입 리퀘스트")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudyGroupRegisterRequest {
    @ApiModelProperty(value="가입하고자 하는 스터디 그룹 UID")
    @Min(value=1, message="그룹 UID의 최소값은 1입니다.")
    @NotNull(message = "그룹 UID는 필수값 입니다.")
    int groupUID;
}
