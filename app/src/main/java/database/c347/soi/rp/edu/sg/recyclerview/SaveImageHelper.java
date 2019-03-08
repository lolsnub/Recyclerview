package database.c347.soi.rp.edu.sg.recyclerview;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.lang.ref.WeakReference;

public class SaveImageHelper implements Target {

    private Context context;
    private WeakReference<AlertDialog> alertDialogWeakReference;
    private WeakReference<ContentResolver> contentResolverWeakReference;
    private String name;
    private String desc;

    public SaveImageHelper(Context context, WeakReference<AlertDialog> alertDialogWeakReference, WeakReference<ContentResolver> contentResolverWeakReference, String name, String desc) {
        this.context = context;
        this.alertDialogWeakReference = alertDialogWeakReference;
        this.contentResolverWeakReference = contentResolverWeakReference;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
        ContentResolver r = contentResolverWeakReference.get();
        AlertDialog alertDialog = alertDialogWeakReference.get();
        if(r != null){
            MediaStore.Images.Media.insertImage(r,bitmap,name,desc);
        }
        alertDialog.dismiss();

        // Open galerry after download
        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_GET_CONTENT);
        context.startActivity(Intent.createChooser(i, "VIEW PICTURE"));

    }

    @Override
    public void onBitmapFailed(Exception e, Drawable errorDrawable) {

    }

    @Override
    public void onPrepareLoad(Drawable placeHolderDrawable) {

    }
}
