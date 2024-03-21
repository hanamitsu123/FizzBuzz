
public class Fizzbuzz {

	public static void main(String[] args) {
		
		//number変数を100まで+1ループ処理する
		for (int number = 1; number <= 100; number++) {
			
			//number変数が3及び5で割り切れる数の場合、「FizzBuzz」と出力する
			if (( number % 3 == 0) && ( number % 5 == 0)) {
				System.out.println("FizzBuzz");
			//number変数が3で割り切れる数の場合、「Fizz」を出力する
			}else if ( number % 3 == 0 ) {
				System.out.println("Fizz");
			
			//number変数が5で割り切れる数の場合、「Buzz」を出力する	
			}else if (number % 5 == 0){
				System.out.println("Buzz");
								
			}else {
			//上記に当てはまらなかった変数を出力する
			System.out.println(number);
			
			}
		}

	}
}
