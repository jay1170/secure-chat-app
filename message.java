
import java.io.Serializable;


public class message implements Serializable{
		
		private static final long serialVersionUID = 1L;
			byte[] data; 
			
			message(byte[] data)
       			{
				this.data = data;
			}
			
			byte[] getData(){
				return data;
			}
			
		}	
