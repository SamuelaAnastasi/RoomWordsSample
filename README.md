# Room Words Sample

This project is part of [**Google's Codelabs for Android**](https://codelabs.developers.google.com/?cat=Android) **Google**. The app is a demonstration Android Architecture Components at work. It stores a list of words in a Room database and displays the list in a RecyclerView. User can add new words and update existing ones, swipe-delete single items or clear all data from database.

## AAC Components
* Room database (Word Entity and Dao) - LiveData<> return type for Database queries
* Repository layer (not part of AAC) helps hiding DB implementation from ViewModel
* VieModel that saves the controller's (MainActivity) data between configuration changes and fetches LiveData<> from the Repository

## Screenshots
![RoomWordsSample](https://raw.githubusercontent.com/SamuelaAnastasi/RoomWordsSample/master/previews/preview.jpg)  
