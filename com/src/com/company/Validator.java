package com.company;
public class Validator {
    public boolean checkAge(int age){
        if(age>=18){
            return true;
        } else {
            return false;
        }
    }
    public boolean checkPassword(String password){
        boolean cycle = true;
        for(int i=0; i<password.length() && cycle; i++){
            cycle = !Character.isUpperCase(password.charAt(i));
            if(!cycle){
                break;
            }
            if(cycle && i==password.length()-1){
                return false;
            };
        }
        cycle = true;
        for(int i=0; i<password.length() && cycle; i++){
            cycle = !Character.isLowerCase(password.charAt(i));
            if(!cycle){
                break;
            }
            if(cycle && i==password.length()-1){
                return false;
            };
        }
        cycle = true;
        for(int i=0; i<password.length() && cycle; i++){
            cycle = !Character.isDigit(password.charAt(i));
            if(!cycle){
                break;
            }
            if(cycle && i==password.length()-1){
                return false;
            };
        }
        cycle = true;
        for(int i=0; i<password.length() && cycle; i++){
            cycle = !Character.isLetterOrDigit(password.charAt(i));
            if(!cycle){
                break;
            }
            if(cycle && i==password.length()-1){
                return false;
            };
        }
        if(password.length() < 8){
            return false;
        }
        return true;
    }
    public boolean checkDate(String date){
        for(int i=0; i<date.length(); i++){
            if(i!=2 && i!=5){
                if(!Character.isDigit(date.charAt(i)));
            }
            if(i==2 || i==5){
                if(date.charAt(i)!='/'){
                    return false;
                }
            }
        }
        return true;
    }
}