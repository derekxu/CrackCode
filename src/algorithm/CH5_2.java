package algorithm;

public class CH5_2 {
	public static String printBinary(String n) {
		int intPart = Integer.parseInt(n.substring(0, n.indexOf('.')));
		double decPart = Double.parseDouble(n.substring(n.indexOf('.'),n.length()));
		StringBuilder sb = new StringBuilder();
		while (intPart > 0) {
			sb.append(intPart & 1);
			intPart>>=1;
		}
		String int_str = sb.reverse().toString();
		StringBuilder dec_string = new StringBuilder();
		while(decPart>0)
		{
			if(dec_string.length()>32) return "ERROR";
			if(decPart==1.0)
			{
				dec_string.append((int) decPart);
				break;
			}
			
			double r = decPart*2;
			if(r>=1)
			{
				dec_string.append('1');
				decPart = r-1;
			}
			else
			{
				dec_string.append('0');
				decPart = r;
			}
		}
		
		return int_str+"."+dec_string.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
