package peach;

/**
 * 一直猴子，摘了一筐的桃子，第一天吃了一筐的一半，第二天吃了第一天剩下的一半，觉得不过瘾又多吃了一个，第三天吃了第二天剩下的一半也多吃了一个，这样下去吃了十天，请问这一框有多少桃子
 * 
 * @author liubin
 *
 */
public class Peach {

	public static void main(String[] args) {
		peachDay(10);
//		 System.out.println(for10(3));
	}

	/**
	 * 
	 * @param day 总共的天数
	 * @return 桃子数
	 */
	public static int peachDay(int day) {
		return countPeach(day, 1, 0);
	}

	/**
	 * f(i)=f(i+1)*2; i=1 
	 * f(i)=(f(i+1)+1)*2; 
	 * 1<i<n f(i)=2; i=n
	 * @param countDay   总共的天数
	 * @param currentDay 当前的天数
	 * @param result     当前的桃子数
	 * @return 当前的桃子数
	 */
	public static int countPeach(int countDay, int currentDay, int result) {

		if (currentDay < countDay) {
			if (currentDay == 1) {
				result = countPeach(countDay, currentDay + 1, result) * 2;
			} else {
				result = (countPeach(countDay, currentDay + 1, result) + 1) * 2;
			}
		} else if (currentDay == countDay) {
			result = 2;
		}

		System.out.println("第" + currentDay + "天吃之前的桃子数：" + result);
		return result;
	}

	public static int for10(int day) {
		int result = 0;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				for (int k = 0; k < 1; k++) {
					result = 2;
				}
				result = (result + 1) * 2;
			}
			result = result * 2;
		}
		return result;
	}
}
