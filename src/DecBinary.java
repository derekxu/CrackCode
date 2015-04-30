import java.util.*;
public class DecBinary {
	public static String getDecBinary(String dec_str){
		double decPart = Double.parseDouble(dec_str.substring(dec_str.indexOf('.')));
		StringBuilder res = new StringBuilder();
		while(decPart>0){
			//if(res.length()>32){return "ERROR";}
			if(decPart==1){
				res.append(1);
				break;
			}
			double r = decPart * 2;
			if(r>=1)
			{
				res.append("1");
				decPart=r-1;
			}
			else{
				res.append("0");
				decPart=r;
			}
		}
		if(res.length()==0)
		{res.append(0);}
		return "0."+res.toString();
	}
	public static void main(String[] args){
		System.out.println(getDecBinary("0.0"));
	}
}
