package filewriter;

import datepackege.DateForm;
import modelstation.StationForm;

public interface IFileWriter {
	public void writer(DateForm date, StationForm station, String filelocation);
}
