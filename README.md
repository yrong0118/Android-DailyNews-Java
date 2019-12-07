# Daily-News

### Daily News - Tinder Flavor News <I>Android app</I> based on MVP architectural pattern in <I>Kotlin</I>

Daily News is an android application developed in Kolten based on the design of the Tinder app and allows users to filter and view the latest news articles. This app allows users to create accounts and like or dislike news articles by swiping left or right on the home page. Liked news articles will be added into the saved news history page, where users can view them later. Disliked articles are removed from the user’s home page. 

The app uses <B><I>Retrofit</I></B> and <B><I>Rxjava</I></B> to fetch the latest news data (category, editor, time, etc.) from a <B><I>RESTFUL</I></B> endpoint (newsapi). The app uses <B><I>fragments</I></B> to support the flexibility of UI layout. Additionally, a ViewPager with BottomBar was developed, which holds Find, Save, and Settings tab states in the MainActivity concurrently. For the managing data, <B><I>Firebase Realtime DB</I></B> was used to store user and news data.

#### 1) Login/ Sign Up
Used Firebase Authentication to implement login / sign up, allow the user to enter in an email / password.

#### 2)Find News - Tinder Flavor
Used Mindorks’s PlaceHolderView to support swipe gestures for liking/disliking news articles.

#### 3）Liked History
The news histories are displayed in a RecyclerView and include title and description and news icon. When there is no news liked history it would show “No Saved News”.

#### 4）News Detail
News detail pages based based on MVP architectural pattern which supports news shows flexibility. It can support multiple types of news display. 

#### 5）Setting page
Supported at least two languages (English plus German)

#### 6）Authentication

#### 7）Firebase Realtime DB
