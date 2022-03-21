package com.example.mydatabasedemo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mydatabasedemo.entity.Product

@Dao
interface ProductDao {

    @Insert
    fun addProduct(product: Product)

    @Query("Select * from ProductTable")
    fun getAll(): List<Product>

    @Query("Select * from ProductTable where price <= :maxPrice")
    fun getPriceRange(maxPrice : Double): List<Product>

}