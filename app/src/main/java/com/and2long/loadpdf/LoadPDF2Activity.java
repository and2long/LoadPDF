package com.and2long.loadpdf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

/**
 * Created by and2long on 16-8-22.
 */
public class LoadPDF2Activity extends AppCompatActivity implements OnPageChangeListener, OnLoadCompleteListener {

    private PDFView pdfView;
    private int pageNumber = 0;
    private String pdfFileName = "唐诗三百首";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadpdf2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("ThreeHundredTangPoems.pdf")
                //.pages(0, 2, 1, 3, 3, 3) // all pages are displayed by default
                .enableSwipe(true)
                //.swipeHorizontal(false)
                //.enableDoubletap(true)
                .defaultPage(0)
                //.onDraw(onDrawListener)
                //.onLoad(this)
                .onPageChange(this)
                //.onPageScroll(onPageScrollListener)
                //.onError(onErrorListener)
                //.enableAnnotationRendering(true)
                //.password(null)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        setTitle(String.format("%s %s / %s", pdfFileName, page + 1, pageCount));
    }

    @Override
    public void loadComplete(int nbPages) {

    }
}
