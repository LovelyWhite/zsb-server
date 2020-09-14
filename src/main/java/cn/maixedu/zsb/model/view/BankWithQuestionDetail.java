package cn.maixedu.zsb.model.view;

import cn.maixedu.zsb.model.BankWithQuestion;
import cn.maixedu.zsb.model.Question;
import cn.maixedu.zsb.model.QuestionWithBLOBs;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/9/11
 */
public class BankWithQuestionDetail extends BankWithQuestion {
    QuestionWithBLOBs question;

    public QuestionWithBLOBs getQuestion() {
        return question;
    }

    public void setQuestion(QuestionWithBLOBs question) {
        this.question = question;
    }
}
