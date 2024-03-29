# Daily-News

### Daily News - Tinder Flavor News <I>Android app</I> based on MVP architectural pattern in <I>Java</I>

Daily News is an android application developed in Kolten based on the design of the Tinder app and allows users to filter and view the latest news articles. This app allows users to like or dislike news articles by swiping left or right on the home page. Liked news articles will be added into the saved news history page, where users can view them later. Disliked articles are removed from the user’s home page. 

The app uses <B><I>Retrofit</I></B> and <B><I>Rxjava</I></B> to fetch the latest news data (category, editor, time, etc.) from a <B><I>RESTFUL</I></B> endpoint (newsapi). The app uses <B><I>fragments</I></B> to support the flexibility of UI layout. Additionally, a ViewPager with BottomBar was developed, which holds Find, Save, and Settings tab states in the MainActivity concurrently. For the managing data, <B><I>Local Database</I></B> was used to store user and news data.

#### 1) Find News - Tinder Flavor
Used Mindorks’s PlaceHolderView to support swipe gestures for liking/disliking news articles.
![](https://github.com/yrong0118/Daily-News/blob/master/ReadMePic/Find%20News.png)

#### 2）Liked History
The news history is displayed in a RecyclerView and shows the title, description, and news source icon. When there are no liked news articles, the news history displays a message stating “No Saved News”.
![](https://github.com/yrong0118/Daily-News/blob/master/ReadMePic/Liked%20History.png)

#### 3）News Detail
News detail pages are based on the Model Viewer Presenter (MVP) architectural pattern which supports news article layout flexibility. It can support multiple types of news article layouts. 
![](https://github.com/yrong0118/DailyNews-Java/blob/master/images/newsDetail.png)

#### 4）Setting page
The application menus supports two languages (English and German). Additionally, the source of the language used in the article can be translated to these two languages. Finally, the app supports clean cache, which clears the in the liked history.

![](https://github.com/yrong0118/DailyNews-Java/blob/master/images/setting.png)

