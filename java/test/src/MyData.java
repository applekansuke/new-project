import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;

import com.example.tool.DumpObject;
/// eee 
public class MyData {
	// map
	Map<String, DumpObject> map = new HashMap<String, DumpObject>();
	// map‚Ìkey
	DefaultListModel model = new DefaultListModel();
	// map‚Ìvalue
	DumpObject dumper;
	Sample sample;

	MyData() {

		sample = new Sample("hello");
		dumper = new DumpObject(sample);
		String lTmp = MyTime.getString() + " Windows";
		map.put(lTmp, dumper);
		model.addElement(lTmp);

		sample = (Sample) sample.clone();
		dumper = new DumpObject(sample);
		lTmp = MyTime.getString() + " Linux";
		map.put(lTmp, dumper);
		model.addElement(lTmp);
		sample.name += " daisuke";

		lTmp = MyTime.getString() + " Other";
		model.addElement(lTmp);

		sample = (Sample) sample.clone();
		dumper = new DumpObject(sample);
		lTmp = MyTime.getString() + " Mac OS X";
		map.put(lTmp, dumper);
		model.addElement(lTmp);
		sample.name += " ahoaho!";

		lTmp = MyTime.getString() + " Other";
		model.addElement(lTmp);
	}
}
