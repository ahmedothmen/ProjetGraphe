import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine="";
		String fichier ="E:/map.txt";
		//File fichier=new File("E:/map.in") ;
        
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			 
			
			
			
			String ligne;
			Integer nbreMap=0;			
			Integer nbreS=0;
			int traite=0;
			int conteur=0;
			int enPosition=0;
			int positionS=2;
			int conteur1=1;
			while ((ligne=br.readLine())!=null){
				int numG=1;
				if (conteur==0){
					nbreMap = Integer.valueOf(ligne);
					traite=nbreMap;
				}
			
				if (conteur1==positionS){
					nbreS = Integer.valueOf(ligne);
					enPosition=positionS+nbreS+1;
					
				}
				conteur++;
					
					
					
				
					if (conteur1>positionS && conteur1<enPosition ){
						
						Graphe gf = new Graphe () ;
					gf.extractFile(positionS, enPosition);
				    
					positionS=enPosition;
					gf.coulorer();
					
					System.out.println(gf);
					System.out.println("********************************************** graphe ");
				
					}
					
					
					
				
					
					 conteur1++;
				
					
					 conteur++;
					
					
				
			}
			
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}

	
	
	
	}

}
