public class E9_1{
	public static void main(String[] args){
		// dataの定義の下にプログラムを書くこと
		String[] data ={"19,女性,64,68,71,71,62",
						"19,女性,37,35,51,35,35",
						"20,男性,71,70,53,54,59",
						"20,男性,37,31,25,30,44",
						"20,女性,36,27,41,54,36",
						"21,男性,81,34,57,42,66",
						"21,女性,56,39,57,55,62",
						"22,男性,69,74,79,81,49",
						"22,女性,92,90,76,47,78",
						"22,女性,19,41,32,39,42",
						"23,男性,0,22,32,8,20",
						"23,男性,26,46,16,37,41",
						"23,男性,47,47,50,56,55",
						"23,女性,28,38,27,29,43",
						"24,男性,62,54,38,54,49",
						"24,男性,28,17,34,24,39",
						"24,男性,49,71,60,60,57",
						"24,男性,52,46,60,44,47",
						"24,男性,51,63,50,42,50",
						"24,女性,62,35,46,38,48",
						"24,女性,51,51,65,57,51",
						"25,男性,45,30,46,53,41",
						"25,女性,71,60,81,84,65",
						"25,女性,27,22,16,38,42",
						"26,男性,75,78,71,69,66",
						"26,男性,29,37,28,20,25",
						"26,男性,22,28,23,37,27",
						"26,女性,25,8,27,38,17",
						"26,女性,58,67,54,69,72",
						"26,女性,44,39,39,46,44",
						"26,女性,41,32,35,37,51",
						"27,男性,81,45,78,73,69",
						"27,男性,57,65,44,47,51",
						"27,男性,42,46,29,41,30",
						"27,男性,91,75,73,71,71",
						"28,男性,54,66,55,87,77",
						"28,男性,70,63,86,62,65",
						"28,女性,50,35,22,47,47",
						"28,女性,71,66,69,62,74",
						"28,女性,54,73,61,57,42",
						"29,男性,29,20,18,38,31",
						"29,女性,76,58,59,56,64",
						"29,女性,38,25,24,34,28",
						"30,男性,73,50,63,56,65",
						"30,男性,88,86,94,82,89",
						"30,男性,72,76,67,79,58",
						"30,男性,99,70,63,84,70",
						"30,男性,43,51,53,58,46",
						"30,女性,42,36,27,23,35",
						"30,女性,71,77,55,60,73",
						"30,女性,77,100,81,74,70",
						"30,女性,24,21,20,28,13",
						"31,男性,51,65,51,56,47",
						"31,女性,37,41,44,42,41",
						"31,女性,54,80,57,69,67",
						"31,女性,74,60,57,58,88",
						"31,女性,58,45,73,51,60",
						"32,男性,53,57,52,76,40",
						"32,男性,75,80,61,89,82",
						"32,女性,20,24,27,15,8",
						"32,女性,14,31,28,28,15",
						"32,女性,31,66,46,62,33",
						"33,男性,63,60,79,70,61",
						"33,男性,27,33,26,55,27",
						"33,女性,11,23,21,15,29",
						"34,男性,67,62,53,51,71",
						"34,男性,55,55,52,35,61",
						"34,男性,48,34,31,28,44",
						"34,女性,7,17,14,38,28",
						"34,女性,18,21,25,23,33",
						"34,女性,56,15,48,28,39",
						"35,男性,39,30,31,41,49",
						"35,男性,16,26,29,33,25",
						"35,男性,42,53,51,57,58",
						"35,男性,36,39,40,59,38",
						"35,男性,41,17,55,40,44",
						"35,男性,75,78,76,65,67",
						"35,女性,64,51,43,43,44",
						"35,女性,64,54,50,48,48",
						"35,女性,76,59,75,60,81",
						"36,男性,67,56,68,62,79",
						"36,男性,78,68,72,65,60",
						"36,男性,81,73,87,76,49",
						"36,女性,55,62,59,70,42",
						"37,男性,86,85,70,66,72",
						"38,男性,103,74,59,61,52",
						"38,男性,59,80,58,57,68",
						"39,男性,61,55,51,58,32",
						"39,女性,13,38,32,38,37",
						"40,男性,44,48,44,53,37",
						"40,男性,32,45,50,42,32",
						"40,女性,48,39,37,32,38",
						"41,男性,36,34,29,14,26",
						"41,男性,80,73,90,86,82",
						"41,男性,37,66,54,44,53",
						"41,男性,35,27,41,23,29",
						"41,男性,40,29,40,38,46",
						"41,女性,65,54,45,45,68",
						"42,男性,39,35,27,45,43",
						"42,男性,42,46,18,20,31"}; 
		// 以下にプログラムを記述

		for(int i=0; i< data.length; i++){
			String[] rowsdata = data[i].split(",");
			String dispdata = "";

			for(int i2=0; i2<rowsdata.length; i2++){
				dispdata = dispdata + rowsdata[i2] + "\t";
			}			
			System.out.println(dispdata.replace("女性","female").replace("男性","male"));            
        }
	}
}
