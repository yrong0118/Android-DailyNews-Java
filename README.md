# Daily-News

##### Daily News - Tinder Flavor News <I>Android app</I> based on MVP architectural pattern in Kotlin 

Daily News is an android application developed in Kolten based on the design of the Tinder app and allows users to filter and view the latest news articles. This app allows users to create accounts and like or dislike news articles by swiping left or right on the home page. Liked news articles will be added into the saved news history page, where users can view them later. Disliked articles are removed from the user’s home page. 

The app uses <B>Retrofit</B> and <B>Rxjava<B/> to fetch the latest news data (category, editor, time, etc.) from a RESTFUL endpoint (newsapi). The app uses fragments to support the flexibility of UI layout. Additionally, a ViewPager with BottomBar was developed, which holds Find, Save, and Settings tab states in the MainActivity concurrently. For the managing data, Firebase Realtime DB was used to store user and news data.

