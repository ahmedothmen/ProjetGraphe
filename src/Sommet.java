import java.util.ArrayList;
import java.util.List;

public class Sommet implements Comparable<Sommet>  {
int id ;
List <Integer> l ;
int couleur;
Integer degree;
public Sommet(int id) {
	super();
	this.id = id;
	l=new ArrayList<Integer>();
}
public Sommet() {
	super();
}
@Override
public String toString() {
	return "Sommet [id=" + id + ", l=" + l + ", couleur=" + couleur + ", degree=" + degree + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Sommet other = (Sommet) obj;
	if (id != other.id)
		return false;
	return true;
}
@Override
public int compareTo(Sommet o) {
return	degree.compareTo(o.degree);
}

}









