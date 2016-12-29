package filewriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import datepackege.DateForm;
import modelstation.StationForm;

public class FileWriterImpl implements IFileWriter{

	public void writer(DateForm date, StationForm station, String folder) {
			
		
		for (int i = 0; i < date.getCountDay(); i++) {
			String carentDate = station.getLocation()+date.getYear()+(i+1);
			String locationFile = folder + carentDate+".txt";
			try (PrintStream out = new PrintStream(new FileOutputStream(locationFile))) {
				out.println("((//10019:"+carentDate+":"+station.getLocationNumber()+":++");
			    out.println("(400):67920:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:2830:0:");
			    out.println("(410):67200:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:0:");
			    out.println("(420):67200:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:2800:0:");
			    out.println("==))");
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
