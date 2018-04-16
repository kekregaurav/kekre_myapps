package linked;

public class GraphDataStructure {

	public static void main(String[] args) {
		GraphOprn g = new GraphOprn();
		g.addVert(new Vertex('A'));
		g.addVert(new Vertex('B'));
		g.addVert(new Vertex('C'));
		g.addVert(new Vertex('D'));
		g.addVert(new Vertex('E'));
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		
		g.displayAdjMat();
		
		System.out.println(g.dFS(0, 'E'));

	}

}

class Vertex {
	public boolean isVisited;
	public char data;
	
	public Vertex(char pData){
		data = pData;
		isVisited = false;
	}
	
}

class GraphOprn {
	
	private final int TOT_NUM_VERTEX = 5;
	private Vertex [] verts = null;
	private int nVerts;
	private int adjMat[][];
	VerStack s = new VerStack();
	
			
	public GraphOprn (){
		verts = new Vertex[TOT_NUM_VERTEX];
		nVerts = 0;
		adjMat =  new int [TOT_NUM_VERTEX][TOT_NUM_VERTEX];
	}
	
	public void addVert(Vertex pVert){
		
		verts [nVerts++] = pVert;
	}
	
	public void addEdge (int pI, int pJ){
		if(verts != null && verts[pI] !=null && verts[pJ] !=null){
			adjMat[pI][pJ] = 1;
			adjMat[pJ][pI] = 1;
		}else{
			System.out.println("No such vertices exist ");
		}
	}
	
	public void displayVertex(int pPstn){
		
		System.out.println(verts[pPstn].data);
	}
	
	public void displayAdjMat(){
		
		for(int i=0; i<TOT_NUM_VERTEX; i++){
			for(int j=0; j<TOT_NUM_VERTEX; j++){
				System.out.print(adjMat[i][j] + ", ");
			}
			System.out.println();
		}
	}
	
	public int getNextAdjUnVistdVrtx(int v){
		
		for(int j=0; j<nVerts; j++){
			
			if(adjMat[v][j] == 1 && !verts[j].isVisited ){
				return j;
			}
		}
		
		return -1;
	}
	
	public boolean dFS(int vertInd, char pVal){
		
		
					
		if(verts[vertInd].data == pVal){
			return true;
		}else{
			
			if(verts[vertInd].isVisited == false)
			{
				verts[vertInd].isVisited = true;
				s.push(vertInd);
			}
			
			int nextVert = getNextAdjUnVistdVrtx(vertInd);
			
			if(nextVert != -1){
				
				return dFS(nextVert, pVal);
			}else{
				s.pop();
				
				if(s.getTop() == -1){
					return false;
				}
				return dFS(s.getTop(), pVal); 
			}
		}
		
		
     }
	
}

class VerStack {
	
	int stack [] = {-1,-1,-1,-1,-1};
	int top = -1;
	
	public void push(int pVal){
		
		if(top < stack.length){
			stack[++top] = pVal;
		}
	}
	
	public int pop(){
		
		int topElem = stack[top];
		stack[top] = -1;
		--top;
		return topElem;
	}
	
	public int getTop(){
		return top;
	}
}

