import java.io.Serializable;

import com.example.tool.DumpObject;

public class Sample  implements Cloneable, Serializable{
    String name;
    Integer []aa = new Integer[10];
    Integer []bb = new Integer[10];
    Integer []cc = new Integer[10];
    Integer []dd = new Integer[10];
    Integer []ee = new Integer[10];
    Integer []ff = new Integer[10];
    Sample partner;
    Sample(String initName) {
        name = initName;
        
        for(int i=0; i<aa.length; i++)
        {
        	aa[i] = new Integer(2);
        }
    }
    void createPartner(String name) {
        partner = new Sample(name);
        partner.connect(this);
    }
    void connect(Sample newPartner) {
        partner = newPartner;
    }
    String getName(){
    	return name;
    }

//    @Override
//	public String toString()  {
//    	return name;
//    }
    
    @Override
	public Object clone()  {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    
    public static void main(String[] args) throws Exception {
        Sample sample = new Sample("hello");
        DumpObject dumper = new DumpObject(sample);
        System.out.println("---- initial state ----");
        System.out.println(dumper);
        sample.createPartner("bye");
        System.out.println("---- second state ----");
        System.out.println(dumper);
    }
}
