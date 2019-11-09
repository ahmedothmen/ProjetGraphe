import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Graphe  {
List <Sommet> list;
int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };


public Graphe() {
	super();
	list= new ArrayList<Sommet>();
}




public void extractFile (int debut, int fin){
	try{
	
                int h;
		int i=1;
		InputStream flux=new FileInputStream("E:/map.txt"); 
		InputStreamReader lecture=new InputStreamReader(flux);
		BufferedReader buff=new BufferedReader(lecture);
		String ligne;
		while ((ligne=buff.readLine())!=null){
		if (i>debut && i<fin){	
		
		
			
			
			
			
			
		String[] result = ligne.split(" ");
		Integer  p=1;
		int pos=1;
		int N=0;
		Sommet r=null;
		for (int x=0; x<result.length; x++)
			
	    	 if(!result[x].equals(" "+"0")){
	    		
	    		 N=i-debut; 
	        	
	        	Integer test=	Integer.parseInt(result[x]);
	       
	        	
	        	r = new Sommet(N);
	     
	
	  
	      
	     
	   
	      if (N==r.id){
	    	 
	    	  r.l.add(test);
	    	 r.degree= p;
	      }
	       
	      list.add(r);
	      p++;
	    	 }
		
		}
		
		i++;
		}
		buff.close(); 
		}		
		catch (Exception e){
		System.out.println(e.toString());
		}






}
 


public void coulorer (){

	
	
	for (int i=0 ;i<list.size();i++){
		
 for (int j=1;j<list.size();j++){
			 
	
	if (list.get(i).id==list.get(j).l.get(0))	{	 
		list.get(i).degree++;  		 
	} 
 
 }
 }
	
list=clearList(list);		
int n=1;
list.get(0).couleur=0;
for (int i=0;i<list.size()-1;i++)	{
	
if (list.get(i).degree!=list.get(i+1).degree){
n++;	
list.get(i+1).couleur=1;	
}	
else list.get(i+1).couleur=0; 		 
}
if (n>2){
	System.out.println(-1);
}
else {
	String resultat="";
	Comparator<Sommet> comparator = new Comparator<Sommet>() {
	    @Override
	    public int compare(Sommet s , Sommet s1) {
	    	return	s.id-(s1.id);
	    }
	};	
	list.sort(comparator);
	for (int i=0;i<list.size();i++)	{
		resultat=resultat+Integer.toString(list.get(i).couleur);
			
		}	
	System.out.println(resultat);
} 

}
public List<Sommet> clearList (List<Sommet> l){

 List <Sommet>	traite = new ArrayList<Sommet>();
	for (int i =l.size()-1;i>=0;i--)	{
if (!traite.contains(l.get(i)))	{
	
	traite.add(l.get(i));
}
}	

	Comparator<Sommet> comparator = new Comparator<Sommet>() {
	    @Override
	    public int compare(Sommet s , Sommet s1) {
	    	return	s.degree.compareTo(s1.degree);
	    }
	};
traite.sort(comparator);	



	


return traite;

}



	
	

 
@Override
public String toString() {
	return "Graphe [list=" + list + "]";
}










}
