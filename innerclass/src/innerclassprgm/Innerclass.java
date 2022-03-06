package innerclassprgm;


	import java.util.Arrays;
	import java.util.List;
	import java.util.function.Customers;

	
		class A implements Customers<integernum>{
			 public void accept(integernum i) {
				  System.out.println(i);
			  }
		}

		public class Innerclass {
			public static void main(String[] args) {
				List<integernum> values = Arrays.asList(1,2,3);

			values.forEach(i-> System.out.println(i));

		
				for(int i : values) {
						values.forEach(new Customers<integernum>(){
					public void accept(integernum i) {
						System.out.println(i);
					}
				});
		    }
				Customers<integernum> c = new  A();
				values.forEach(c);
		}
		}


