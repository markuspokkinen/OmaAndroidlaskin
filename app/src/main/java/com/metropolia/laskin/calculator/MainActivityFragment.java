package com.metropolia.laskin.calculator;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    TextView tx;
    TextView tx2;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b_plus, b_min, b_tim, b_div, b_calc, b_del, b_AC, b_dot;
    Button[] nButtons = new Button[10];
    private String data = "";
    private String numdata = "";

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        tx = v.findViewById(R.id.textView2);
        tx2 = v.findViewById(R.id.textView3);

        b0 = v.findViewById(R.id.Calc_0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "0";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));
            }
        });
        b1 = v.findViewById(R.id.Calc_1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "1";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));

            }
        });
        b2 = v.findViewById(R.id.Calc_2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "2";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));

            }
        });
        b3 = v.findViewById(R.id.Calc_3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "3";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));

            }
        });
        b4 = v.findViewById(R.id.Calc_4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "4";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));

            }
        });
        b5 = v.findViewById(R.id.Calc_5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "5";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));

            }
        });
        b6 = v.findViewById(R.id.Calc_6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "6";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));

            }
        });
        b7 = v.findViewById(R.id.Calc_7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "7";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));

            }
        });
        b8 = v.findViewById(R.id.Calc_8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "8";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));
            }
        });
        b9 = v.findViewById(R.id.Calc_9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "9";
                tx.setText(data);
                float numb = calculate();
                System.out.println("calc " + numb);
                tx2.setText(Float.toString(numb));

            }
        });
        b_plus = v.findViewById(R.id.Calc_plus);
        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "+";
                tx.setText(data);
            }
        });
        b_div = v.findViewById(R.id.Calc_div);
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "/";
                tx.setText(data);
            }
        });
        b_min = v.findViewById(R.id.Calc_minus);
        b_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "-";
                tx.setText(data);
            }
        });
        b_tim = v.findViewById(R.id.Calc_Times);
        b_tim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += "*";
                tx.setText(data);
            }
        });
        b_calc = v.findViewById(R.id.Calc_calc);
        b_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //laskutoimitus
                float tul = fullcalculate();
                tx.setText(Float.toString(tul));
                tx2.setText("0");
                data = "";
            }
        });
        b_del = v.findViewById(R.id.Calc_del);
        b_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.length() > 0) {
                    String s2 = data.substring(0, data.length() - 1);
                    data = s2;
                    tx.setText(data);
                    float tul = calculate();
                    tx2.setText(Float.toString(tul));
                }

            }
        });
        b_AC = v.findViewById(R.id.Calc_AC);
        b_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = "";
                tx.setText(data);
                tx2.setText("0");
            }
        });
        b_dot = v.findViewById(R.id.Calc_dot);
        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data += ".";
                tx.setText(data);
            }
        });
        return v;
    }
    private float fullcalculate(){
        float lasku = 0;
        String tmp = data;

        boolean done = false;
        while(!done) {
            Object[] nums;
            if (tmp.contains("*") && tmp.contains("/")) {
                if(tmp.indexOf("*") < tmp.indexOf("/")){
                    //kertolasku
                    nums = arvot(tmp.indexOf("*"),tmp);
                    if (pistetarkistus((String) nums[0]) && pistetarkistus((String) nums[1])) {
                        lasku = Float.parseFloat((String) nums[0]) * Float.parseFloat((String) nums[1]);
                        tmp = tmp.substring(0, (int)nums[2]+1) + lasku + tmp.substring((int) nums[3],tmp.length());
                    }

                }else{
                    //jakolasku
                    nums = arvot(tmp.indexOf("*"),tmp);
                    if (pistetarkistus((String) nums[0]) && pistetarkistus((String) nums[1])) {
                        lasku = Float.parseFloat((String) nums[0]) / Float.parseFloat((String) nums[1]);
                        tmp = tmp.substring(0, (int)nums[2]+1) + lasku + tmp.substring((int) nums[3],tmp.length());
                    }
                }

            }
            if (tmp.contains("*")) {
               nums = arvot(tmp.indexOf("*"),tmp);
                if (pistetarkistus((String) nums[0]) && pistetarkistus((String) nums[1])) {
                    lasku = Float.parseFloat((String) nums[0]) * Float.parseFloat((String) nums[1]);
                    tmp = tmp.substring(0, (int)nums[2]+1) + lasku + tmp.substring((int) nums[3],tmp.length());
                }

            }if(tmp.contains("/")){
                nums = arvot(tmp.indexOf("/"),tmp);
                lasku = Float.parseFloat((String) nums[0]) / Float.parseFloat((String) nums[1]);
                tmp = tmp.substring(0, (((int) (nums[2])) + 1)) + lasku + tmp.substring((((int) nums[3])),tmp.length());

            } else if(tmp.contains("+") && tmp.contains("-")){
                if(tmp.indexOf("+") < tmp.indexOf("-")){
                    nums = arvot(tmp.indexOf("+"),tmp);
                    lasku = Float.parseFloat((String) nums[0]) + Float.parseFloat((String) nums[1]);
                    tmp = tmp.substring(0, (((int) (nums[2])) + 1)) + lasku + tmp.substring((((int) nums[3])),tmp.length());
                }else{
                    nums = arvot(tmp.indexOf("-"),tmp);
                    lasku = Float.parseFloat((String) nums[0]) - Float.parseFloat((String) nums[1]);
                    tmp = tmp.substring(0, (((int) (nums[2])) + 1)) + lasku + tmp.substring((((int) nums[3])),tmp.length());
                }
            }
                else if(tmp.contains("+")){
                nums = arvot(tmp.indexOf("+"),tmp);
                lasku = Float.parseFloat((String) nums[0]) + Float.parseFloat((String) nums[1]);
                tmp = tmp.substring(0, (((int) (nums[2])) + 1)) + lasku + tmp.substring((((int) nums[3])),tmp.length());

            }else if(tmp.contains("-")){
                nums = arvot(tmp.indexOf("-"),tmp);
                lasku = Float.parseFloat((String) nums[0]) - Float.parseFloat((String) nums[1]);
                tmp = tmp.substring(0, (((int) (nums[2])) + 1)) + lasku + tmp.substring((((int) nums[3])),tmp.length());

            }
            else{
                done = true;
            }
        }

        return lasku;
    }
    private float calculate() {
        float lasku = 0;
        Object[] nums;

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '*') {
                //kertolasku
                nums = arvot(i,data);
                if (pistetarkistus((String) nums[0]) && pistetarkistus((String) nums[1])) {
                    if((String)nums[0] != "" && (String)nums[1] != "") {
                        lasku = Float.parseFloat((String) nums[0]) * Float.parseFloat((String) nums[1]);
                    }

                }
            }
            if (data.charAt(i) == '/') {
                nums = arvot(i,data);
                if (pistetarkistus((String) nums[0]) && pistetarkistus((String) nums[1])) {
                    if((String)nums[0] != "" && (String)nums[1] != "") {
                        lasku = Float.parseFloat((String) nums[0]) / Float.parseFloat((String) nums[1]);
                    }
                }
            } else if (data.charAt(i) == '+') {
                nums  = arvot(i,data);
                if (pistetarkistus((String) nums[0]) && pistetarkistus((String) nums[1])) {
                    if((String)nums[0] != "" && (String)nums[1] != "") {
                        lasku = Float.parseFloat((String) nums[0]) + Float.parseFloat((String) nums[1]);
                    }
                }
            } else if (data.charAt(i) == '-') {
                nums = arvot(i,data);
                if (pistetarkistus((String) nums[0]) && pistetarkistus((String) nums[1])) {
                    if((String)nums[0] != "" && (String)nums[1] != "") {
                        lasku = Float.parseFloat((String) nums[0]) - Float.parseFloat((String) nums[1]);
                    }
                }
            }
        }
        return lasku;
    }

    private boolean isNumber(char s) {
        switch (s) {
            case '0':
                return true;
            case '1':
                return true;
            case '2':
                return true;
            case '3':
                return true;
            case '4':
                return true;
            case '5':
                return true;
            case '6':
                return true;
            case '7':
                return true;
            case '8':
                return true;
            case '9':
                return true;
            case '.':
                return true;
            case '-':
                return true;
            default:
                return false;
        }
    }

    private boolean pistetarkistus(String s) {
        int lkmpiste = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                lkmpiste++;
            }
        }
        if (lkmpiste < 2) {
            //onnistui
            return true;
        } else {
            //virhe
            return false;
        }
    }

    private Object[] arvot(int index,String tmp) {
        String Sminus = "";
        String Splus = "";

        int readintmin = index - 1;
        while (readintmin >= 0 && isNumber(tmp.charAt(readintmin))) {
            Sminus += tmp.charAt(readintmin);
            readintmin--;
        }

        Sminus = new StringBuilder(Sminus).reverse().toString();

        int readintplus = index + 1;
        while (readintplus < tmp.length() && isNumber(tmp.charAt(readintplus))) {
            Splus += tmp.charAt(readintplus);
            readintplus++;
        }
        return new Object[]{Sminus, Splus, readintmin, readintplus};
    }
}