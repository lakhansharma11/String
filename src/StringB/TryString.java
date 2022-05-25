package StringB;

public class TryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Lakhan";
		String b = new String("Lakhan");
		String c = "Lakhan";
		System.out.println(a);
		System.out.println("Character at %s : "+a.charAt(3));
		System.out.println("A :"+a.equals("Lakhan"));
		System.out.println("A : "+a == "Lakhan");
		System.out.println("A eq B: "+a.equals(b));
		System.out.println("A == b: "+a == b);
		System.out.println("A eq c : "+a.equals(c));
		System.out.println("A == c: "+a == c);
		System.out.println("Length : "+a.length());
		System.out.println("New value: "+ a.replace('a', '1'));
		System.out.println("" + a.toUpperCase());


	}

}
