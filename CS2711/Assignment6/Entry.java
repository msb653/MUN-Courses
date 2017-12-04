public class Entry{
		private int k; // key
		private Student v; // value
		public Entry(int key, Student value) {
			k = key;
			v = value;
		}
		// Accessors
		public int getKey( ) { return k; }
		public Student getValue( ) { return v; }
		// Mutators
		protected void setKey(int key) { k = key; }
		protected Student setValue(Student value) {
			Student old = v;
			v = value;
			return old;
		}
}