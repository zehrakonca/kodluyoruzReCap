package burcBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int month,day;
	        String burc = "";
	        boolean isError = false;

	        Scanner i = new Scanner(System.in); 

	        System.out.print("please enter your birth month : ");

	        month = i.nextInt();

	        System.out.print("please enter your birth day : ");

	        day = i.nextInt();

	        i.close();
	     
	     if(month >= 1 && month <= 12){
	        if(month == 1){
	            if(day >=1 && day <= 31){
	                if(day <= 21){
	                    burc = "Capricorn";
	                } else{
	                    burc = "Aquarius";
	                }
	            } else{
	                isError = true;
	            }
	        } else if(month == 2){
	            if(day >= 1 && day <= 28){
	                if(day <= 19){
	                    burc = "Aquarius";
	                } else{
	                    burc = "Pisces";
	                }
	            } else{
	                isError = true;
	            }
	        } else if (month == 3){
	            if(day >= 1 && day <= 31){
	                if(day <= 20){
	                    burc = "Pisces";
	                } else{
	                    burc = "Aries";
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 4){
	            if(day >= 1 && day <= 30 ){
	                if(day <= 20){
	                    burc = "Aries";
	                } else{
	                    burc = "Taurus";
	                }
	            } else {
	                isError = true;
	            }
	        } else if(month == 5){
	            if(day >= 1 && day <= 31){
	                if(day <= 20){
	                    burc = "Taurus";
	                } else {
	                    burc = "Gemini";
	                }
	            } else{
	                isError = true;
	            }
	        } else if(month == 6){
	            if(day >= 1 && day <= 30){
	                if(day <= 21){
	                    burc = "Gemini";
	                } else{
	                    burc = "Cancer";
	                }
	            }else{
	                isError = true;
	            }
	        } else if(month == 7){
	            if(day >= 1 && day <= 31){
	                if(day <= 22){
	                    burc = "Cancer";
	                }else{
	                    burc = "Leo";
	                }
	            } else{
	                isError = true;
	            }
	        } else if(month == 8){
	            if(day >= 1 && day <= 31){
	                if(day <= 23){
	                    burc = "Leo";
	                } else {
	                    burc = "Virgo";
	                }
	            } else{
	                isError = true;
	            }
	        } else if(month == 9){
	            if(day >= 1 && day <= 30 ){
	                if(day <= 23){
	                    burc = "Virgo";
	                } else{
	                    burc = "Libra";
	                }
	            } else{
	                isError = true;
	            }
	        } else if(month == 10){
	            if(day >= 1 && day <= 31){
	                if(day <= 23){
	                    burc = "Libra";
	                } else{
	                    burc = "Scorpio";
	                }
	            } else {
	                isError = true;
	            }
	        } else if(month == 11){
	            if(day >= 1 && day <= 30){
	                if(day <= 22){
	                    burc = "Scorpio";
	                } else{
	                    burc = "Sagittarius";
	                }    
	            } else{
	                isError = true;
	            }
	        } else if(month == 12){
	            if(day >= 1 && day <= 31){
	                if(day <= 22){
	                    burc = "Sagittarius";   
	                } else{
	                    burc = "Capricorn";
	                }
	            } else{
	                isError = true;
	            }
	        }

	    } else{
	        isError = true;
	    }
	            
	         
	        if(isError){
	            System.out.println("you entered informations wrong. please check your informations.");
	        } else{
	            System.out.println("your zodiac : "+ burc);
	        }
		
		

	}

}
