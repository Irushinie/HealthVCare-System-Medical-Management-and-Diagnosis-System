package com.irushinie.healthvcare.commons.model.pressure;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pressure")
public class Pressure implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


    int inputPressure;
    int age;
    String result;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInputPressure() {
        return inputPressure;
    }

    public void setInputPressure(int inputPressure) {
        this.inputPressure = inputPressure;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {

        if(age>15 && age<19) {
            if (inputPressure< 120 && inputPressure>105) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 120) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<105) {
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
        else if (age>20 && age<24){
            if (inputPressure< 132 && inputPressure>108) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 132) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<108) {
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
        else if (age>25 && age<29){
            if (inputPressure< 133 && inputPressure>109) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 133) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<109){
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
        else if (age>30 && age<34){
            if (inputPressure< 134 && inputPressure>110) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 134) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<110){
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
        else if (age>35 && age<39){
            if (inputPressure< 135 && inputPressure>111) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 135) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<111) {
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
        else if (age>40 && age<44){
            if (inputPressure< 137 && inputPressure>112) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 137) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<112) {
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
        else if (age>45 && age<49){
            if (inputPressure< 139 && inputPressure>115) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 139) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<115) {
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
        else if (age>50 && age<54){
            if (inputPressure< 142 && inputPressure>116) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 142) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<116) {
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
        else if (age>55 && age<59){
            if (inputPressure< 144 && inputPressure>118) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 144) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<117) {
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
        else if (age>60 && age<70) {
            if (inputPressure < 147 && inputPressure > 121) {
                result = "Your Systolic Blood Pressure is at Healthy number";
            } else if (inputPressure > 147) {
                result = "Your Systolic Blood Pressure is at Maximum level. Need to Decrease";
            } else if (inputPressure<121) {
                result = "Your Systolic Blood Pressure is Low level, Need to Increase";
            }
        }
            return result;

    }

}
