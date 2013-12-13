public class pagerank {
	public static void main(String[] args){
		int page_num = 7;
		double[][] link = {{0,1,1,1,1,0,1},{1,0,0,0,0,0,0},{1,1,0,0,0,0,0},{0,1,1,0,1,0,0},{1,0,1,1,0,1,0},{1,0,0,0,1,0,0},{0,0,0,0,1,0,0}}; //setting of link vector---------
		for(int i=0; i<page_num; i++){
			int total = 0;
			for(int j=0; j<page_num; j++) total += link[i][j];
			for(int j=0; j<page_num; j++) link[i][j] = link[i][j] / total;
		}
		double[] point = {1,0,0,0,0,0,0}; //setting point for initialization
		double[] _point = new double[page_num];
		for(int count=0; count<100;count++){
			for(int i=0; i<page_num; i++){
				_point[i] = 0.0;
				for(int j=0;j<page_num;j++) _point[i] += point[j] * link[j][i];
			}
			for(int i=0; i<page_num; i++) point[i] = _point[i];
		}

		for(int i=0; i<page_num; i++) System.out.println(point[i]);
	}
}
