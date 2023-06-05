class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        int m = queries.length;
			long ans = 0;
			long t0 = n, t1 = n;
			Set<Integer> d0 = new HashSet<>();
			Set<Integer> d1 = new HashSet<>();
			for(int i = m-1;i >= 0;i--){
				int[] q = queries[i];
				if(q[0] == 0){
					if(d0.add(q[1])){
						ans += t1 * q[2];
						t0--;
					}
				}else{
					if(d1.add(q[1])){
						ans += t0 * q[2];
						t1--;
					}
				}
			}
			return ans;
    }
}