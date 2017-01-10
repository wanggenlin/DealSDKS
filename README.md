# DealSDKS
   sdk 说明 sdk 提供deal的列表和详情的接口 
   
1. 代码结构 

   1.1 app demo 演示
   
   1.2 app/libs/dealSdk.jar 接入的sdk
   
2. 集成步骤

   2.1 manifest 文件增加 <uses-permission android:name="android.permission.INTERNET" /> 权限
   
   2.2 在相应的 ../libs/ 引入dealSdk.jar 的文件即可
   
   2.3 调用 deal 列表的方法
   
  	DealController.getInstance().list(MainActivity.this, 1, MainActivity.this);
        
		第一个参数 Context 上下文
        
		第二个参数 当前页数
        
		第三个参数 DataLisener sdk定义的数据的接口实现
   
   2.4 调用deal 详情方法 
	
	DealController.getInstance().detial(MainActivity.this,"99059027", MainActivity.this);
 	
	第一个参数 Context 上下文
	
        第二个参数 deal id 列表中获取
		
        第三个参数 DataLisener sdk定义的数据的接口实现
		
3. 接口返回字段解释
	
	列表接口：
	{
    	isLastPage=false, 是否是最后一页
    	deals=[deal 列表
		
        Deal
		
           {
            id='99081313', //deal id 
            image='http: //img1.hasofferimage.com/2017/0109/1203/28/2984_180x121.jpg',// deal 图片
            website='SHOPCLUES', //deal websit 
            title='MelbonCRVMobilePhone', // deal title
            originPrice=765,//deal 原价
            presentPrice=399,// deal 现价
            createTime='1dayago',// deal 生成时间
            type=1,// deal权重
            priceDescription='Rs.399',//deal 价格描述
            deeplink='',// deal 跳转link
            description=''// deal 描述
            }
    	  ]
	}
	
        详情接口：
		
         同上面的deal
		 
4. 更新

   sdk v1.0 init project
         
    
   
