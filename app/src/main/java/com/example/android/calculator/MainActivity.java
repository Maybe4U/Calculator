package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnDivide;
    private Button btnMultiply;
    private Button btnDot;
    private Button btnBack;
    private Button btnClr;
    private Button btnPar;
    private Button btnEqu;
    private TextView textView1;
    private TextView textView2;
    String temp = "";
    int flag,flagClr;
    boolean flagClick,isDot;
    double x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.one);
        btn2 = (Button)findViewById(R.id.two);
        btn3 = (Button)findViewById(R.id.three);
        btn4 = (Button)findViewById(R.id.four);
        btn5 = (Button)findViewById(R.id.five);
        btn6 = (Button)findViewById(R.id.six);
        btn7 = (Button)findViewById(R.id.seven);
        btn8 = (Button)findViewById(R.id.eight);
        btn9 = (Button)findViewById(R.id.nine);
        btn0 = (Button)findViewById(R.id.zero);
        btnPlus = (Button)findViewById(R.id.plus);
        btnMinus = (Button)findViewById(R.id.minus);
        btnDivide = (Button)findViewById(R.id.divide);
        btnMultiply = (Button)findViewById(R.id.multiply);
        btnDot = (Button)findViewById(R.id.dot);
        btnBack = (Button)findViewById(R.id.back);
        btnClr = (Button)findViewById(R.id.clear);
        btnPar = (Button)findViewById(R.id.parenthesis);
        btnEqu = (Button)findViewById(R.id.equal);
        textView1 = (TextView)findViewById(R.id.input1);
        textView2 = (TextView)findViewById(R.id.input2);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(btn0.getText().toString());

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = btn1.getText().toString();
                show(str1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(btn2.getText().toString());

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(btn3.getText().toString());

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(btn4.getText().toString());

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(btn5.getText().toString());

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(btn6.getText().toString());

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(btn7.getText().toString());

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(btn8.getText().toString());

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(btn9.getText().toString());

            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getText().toString().equals("")){}
                else if(isDot == true){
                    textView2.setText(textView2.getText()+".");
                    isDot = false;
                }else
                    textView2.setText(textView2.getText().toString());
            }
        });
        btnPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textView2.getText().equals("")){
                }else{
                    flag = 1;    //加法标志位
                    x = Double.parseDouble(textView2.getText().toString().trim());
                    textView2.setText(textView2.getText().toString()+"+");
                    flagClick =false;
                }

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getText().equals("")){
                }
                else if(textView2.getText() != null){
                    flag = 2;    //减法标志位
                    x = Double.parseDouble(textView2.getText().toString().trim());
                    textView2.setText(textView2.getText().toString()+"－");
                    flagClick =false;
                }else
                textView2.setText("－");
                isDot = true;
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getText().equals("")){
                }else{
                    flag = 3;    //乘法标志位
                    x = Double.parseDouble(textView2.getText().toString().trim());
                    textView2.setText(textView2.getText().toString()+"×");
                    flagClick =false;
                }
                isDot = true;
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getText().equals("0")||textView2.getText().equals("")){
                    textView2.setText("ERROR");
                    flagClick =false;
                    return;
                }else{
                    flag = 4;
                    x = Double.parseDouble(textView2.getText().toString().trim());
                    textView2.setText(textView2.getText().toString()+"÷");
                    flagClick =false;
                }
                isDot =true;
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagClr++;
                if(flagClr == 1)
                    textView2.setText("");
                else if(flagClr == 2){
                    textView1.setText("");
                    flagClr = 0;
                }
                isDot = true;
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getText().equals("0")||textView2.getText().equals(""))
                    return;
                if(textView2.getText().length() == 1){
                    textView2.setText("");
                    return;
                }
                String temp = textView2.getText().toString();
                temp = temp.substring(0,temp.length()-1);
                textView2.setText(temp);
                isDot = true;

            }
        });
        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getText().equals("0")||textView2.getText().equals(""))
                    return;
                y = Double.parseDouble(textView2.getText().toString().trim());
                textView1.setText(textView1.getText().toString()+textView2.getText().toString());
                switch (flag){
                    case 1:
                        textView2.setText(String.valueOf(x + y));
                        break;
                    case 2:
                        textView2.setText(String.valueOf(x - y));
                        break;
                    case 3:
                        textView2.setText(String.valueOf(x * y));
                        break;
                    case 4:
                        textView2.setText(String.valueOf(x / y));
                        break;
                    default:
                        break;
                }
                flagClick = false;    //内容清除位 计算完成后输入后面的数将当前的结果清除
                if(textView2.getText().toString()=="")
                    isDot = true;
                else
                    isDot = false;
            }
        });
    }

    public void show(String i){
        if(flagClick == false){
            textView1.setText(textView2.getText().toString());
            textView2.setText("");
            textView2.setText(textView2.getText()+i);
            flagClick = true;
        }
        else {
            textView2.setText(textView2.getText()+i);
        }
    }
}
