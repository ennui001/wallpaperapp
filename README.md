# WALLPAPERAPP
Easy android studio working wallpaper app for beginners.

# SUMMARY OF WALLPAPER APP
-> This app consist of two activities , viz, Splash and MainActivity  with their respective xml file where main activity is our default activity and splash is launcher . In the manifest we can specify the order.

-> The mainactivity file we have created contains the image view in the linear layout which will show an image of the wallpaper , a button to select image as wallpaper, a horizontal scrollbar, which contains selected images that we have inserted in drawable for each wallpaper. When the image is selected, it will set the wallpaper on the device to the image selected. 

# steps required
1 | Requesting Permissions in the Android Manifest
We will need to request the following Android permissions in the manifest file for our Android wallpaper app to work.
<uses-permission android:name="android.permission.SET_WALLPAPER" />

2 | Setting the Wallpaper to whole screen using the Android WindowManager a system service, which is responsible for managing the z-ordered list of windows, which windows are visible, and how they are laid out on screen.
Each activity has an associated window (on which the whole UI draws). This window has default way of being drawn .However, we can use requestWindowFeature to ask the system to include or exclude some of windows features (toolbar, actionbar and so on).
example, we have  used FEATURE_NO_TITLE to make a window full screen
<br>requestWindowFeature(Window.FEATURE_NO_TITLE);<br>getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,<br>WindowManager.LayoutParams.FLAG_FULLSCREEN);

3 | Setting wallpaper using Bitmap : The Bitmap class represents a bitmap image. We create bitmaps via the BitmapFactory class. Using a BitmapFactory, we can create bitmaps in three common ways: from a resource, a file, or an InputStream. 
We used InputStream in our app, so we used decodeStream() method.

 InputStream is = getResources().openRawResource(tophone);<br>.Bitmap bm = BitmapFactory.decodeStream(is);
 
 #outputs:-
 <br>
 <img src="https://user-images.githubusercontent.com/105364747/234338050-0fb11472-2a6d-49ba-80f6-70b3aa225bb5.png" width="200" height="400"/>
 <img src="https://user-images.githubusercontent.com/105364747/234342328-17f02497-a4e9-44d8-8f73-2229979a6c29.png" width="200" height="400"/>
 <img src="https://user-images.githubusercontent.com/105364747/234342549-caf3000b-0df9-45b9-b995-74d06fd54988.png" width="200" height="400"/>
 <img src="https://user-images.githubusercontent.com/105364747/234342810-2eabcd65-f191-40af-9437-ca24a87c28b0.png" width="200" height="400"/>
