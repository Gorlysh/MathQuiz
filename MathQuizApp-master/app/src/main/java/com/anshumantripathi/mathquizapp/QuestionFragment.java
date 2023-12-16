package com.anshumantripathi.mathquizapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by AnshumanTripathi on 10/9/16.
 */

public class QuestionFragment extends Fragment{

    TextView operationText;
    TextView answerText;
    TextView num1Text;
    TextView num2Text;
    TextView timer;
    TextView questionNumber;
    public QuestionFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.question,container,false);
        return view;
    }

}
