package com.utsman.kemana.base

import androidx.fragment.app.Fragment
import io.reactivex.disposables.CompositeDisposable

open class RxFragment : Fragment() {
    open val compositeDisposable = CompositeDisposable()

    override fun onDestroy() {
        compositeDisposable.dispose()
        super.onDestroy()
    }
}