package wordCounts;
		public class WordCounts { 
		public static void main(String[] args) {
			String a1[]=new String[420];
	    	  String words= ( "汉皇重色思倾国御宇多年求不得"
	        		+"杨家有女初长成养在深闺人未识"
	        		+"天生丽质难自弃一朝选在君王侧"
	        		+"回眸一笑百媚生六宫粉黛无颜色"
	        		+"侍儿扶起娇无力始是新承恩泽时"
	        		+"云鬓花颜金步摇芙蓉帐暖度春宵"
		                +"春宵苦短日高起从此君王不早朝"
		                +"承欢侍宴无闲暇春从春游夜专夜"
		                +"后宫佳丽三千人三千宠爱在一身"
		                +"金屋妆成娇侍夜玉楼宴罢醉和春"
		        	+"姊妹弟兄皆列土可怜光彩生门户"
		        	+"遂令天下父母心不重生男重生女"
		        	+"骊宫高处入青云仙乐风飘处处闻"
		        	+"缓歌慢舞凝丝竹尽日君王看不足"
		        	+"渔阳鼙鼓动地来惊破霓裳羽衣曲"
		        	+"九重城阙烟尘生千乘万骑西南行"
	        		+"翠华摇摇行复止西出都门百余里"
	        		+"六军不发无奈何宛转蛾眉马前死"
	        		+"花钿委地无人收翠翘金雀玉搔头"
	        		+"君王掩面救不得回看血泪相和流"
	        		+"黄埃散漫风萧索云栈萦纡登剑阁"
	        		+"峨嵋山下少人行旌旗无光日色薄"
	        		+"蜀江水碧蜀山青圣主朝朝暮暮情"
	        		+"行宫见月伤心色夜雨闻铃肠断声"
	        		+"天旋地转回龙驭到此踌躇不能去"
	        		+"马嵬坡下泥土中不见玉颜空死处" 
	        		+"君臣相顾尽沾衣东望都门信马归"
	        		+"芙蓉如面柳如眉对此如何不泪垂"
	        		+"春风桃李花开日秋雨梧桐叶落时"
	        		+"西宫南内多秋草落叶满阶红不扫"
	        		+"梨园弟子白发新椒房阿监青娥老"
	        		+"夕殿萤飞思悄然孤灯挑尽未成眠"
	        		+"迟迟钟鼓初长夜耿耿星河欲曙天"
	        		+"鸳鸯瓦冷霜华重翡翠衾寒谁与共"
	        		+"临邛道士鸿都客能以精诚致魂魄");
		   String a="";
	       int size=(words.length()%7==0)?(words.length()/7):(words.length()/7+1);
	       if(words.length() <7 ) {                      // 判断字符串的长度是否大于7
	    	   a = words;
	      }
	    		   for(int i=0;i<size;i++){
	    			   if(i%2==0)
	    			      a+=words.substring(i*7,i*7+7)+","; 
	    			   else{
	    				   a+=words.substring(i*7,i*7+7)+".\n";
	    			   } 
	    		   }
	    		      System.out.println(a);
	    		      int count=0;
	  				  String str1="爱";        //输入要查找的汉字
	  				  while(words.indexOf(str1)!=-1){
	  					int c=words.indexOf(str1);
	  					words=words.substring(c+str1.length());
	  					count++;	
	  				}
	  			System.out.println("输出要查找汉字的个数为:"+count);
					 String count1 = null;
	  				 try{ 
						for(int i=0;i<450;i++)
	  					{count1 += a1[i];}
	  					System.out.println("count="+count1);
	  				}
	  					catch(ArrayIndexOutOfBoundsException e){
	  						System.out.println("发生异常原因："+e);
	  					}
	  					finally{
	  						System.out.println("程序运行结束！");
	  					}
	  			}
		
	     }
		
		
		
		
	    	 
	      
	      
	       
	       
		
		
		

		
		



