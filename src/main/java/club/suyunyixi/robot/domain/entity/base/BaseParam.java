package club.suyunyixi.robot.domain.entity.base;

import club.suyunyixi.robot.domain.entity.enums.MessageSource;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.function.Supplier;

/**
 * @author Suyunyixi
 * @date 2023/2/9 10:14
 */
@Data
@Accessors(chain = true)
public class BaseParam {
    /**
     * 请求消息来源
     */
    private MessageSource source;
    /**
     * 请求消息体
     */
    private String reqMessage;
    /**
     * 回复人, 即请求人
     */
    private String at;
    /**
     * 群号
     */
    private String groupNum;

    public BaseParam setIfTrue(boolean b, Supplier<? super BaseParam> action) {
        if (b) {
            action.get();
        }
        return this;
    }
}