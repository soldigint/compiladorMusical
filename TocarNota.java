package Musical;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

public class TocarNota {

	TocarNota( )
	{
		
	}
	
	void Tocar(byte [] nota)
	{
		SourceDataLine line =null;
		try{
			
		AudioFormat af1 = new AudioFormat(22000, 8, 1, true, true);
        line = AudioSystem.getSourceDataLine(af1);
        line.open(af1, 22000);
        line.start();
       line.write(nota, 0, nota.length);    
        line.drain();
        
		}catch(Exception e){
            e.printStackTrace();
      
        }finally{
             if (line!=null){
                line.close();
            }
        }
	}
	
}
