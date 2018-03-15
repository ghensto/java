//1
public class MyParent { 
	private int someNum; 
	private OtherClass obj; 

	public MyParent(int i) { 
		someNum = I; 
		obj = null; 
	}
	public MyParent(int i, OtherClass oc) {
		someNum = i;
		obj = new OtherClass(oc);
	}

	public MyParent(MyParent mp) {
		someNum = mp.someNum;
		obj = new OtherClass(mp.obj);
	}

	public boolean equals(Object o) {
		if(obj == null) return false;
		if(!(this.getClass() == o.getClass())) return false;
		MyParent mp = (MyParent)o;
		if(this.someNum == mp.someNum && this.obj.equals(mp.obj)) return true;
		return false;
	}
	
	public toString() { 
        return “This is a MyParent.”; 
	}          
}

//2

public class MyChild extends MyParent{
	private char type;

	public MyChild(char c, int i) {
		super(i);
		type = c;
	}

	public MyChild(char c, int i, OtherClass o) {
		super(i, o);
		type = c;
	}

	public MyChild(MyChild m) {
		super(m);
		type = m.type;
	}

	public char getType() return type;

}

//3

public class Number3 {
	public static void main(String args[]) {
		MyParent mp[] = new MyParent[10];
		char ch = 'A';
		for(int i = 0; i < 10; i++) {
			if((int)(Math.random()*2) == 0)
				mp[i] = new MyParent(i, new OtherClass());
			else {
				mp[i] = new MyChild(ch , i, new OtherClass());
				ch++;
			}
		}
	}
}

//4

for (int i = 0; i < 10; i++) {
	if(mp[i] instanceof MyChild) {
		System.out.println(((MyChild)mp[i]).getType());
	}
}





















