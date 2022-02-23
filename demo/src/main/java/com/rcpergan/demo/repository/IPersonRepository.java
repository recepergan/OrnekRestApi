package com.rcpergan.demo.repository;

import com.rcpergan.demo.repository.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPersonRepository extends JpaRepository<Person,Long> {

    //1- find ile başlamalısınız
    //2- DİKKAT !!! Değişken isimlerini yazarken büyük küçük harf duyarlıdır
    //yazım şekli kuralları şu şekildedir.tümü küçük harf ile yazılmış alanların Baş harfleri
    //büyük yazılmalıdır
    //3- işleme tabi tutacak değerler method parametresi olarak girilmelidirNOT :değişken adı ile aynı olmak
    //zorunda değildir
    List<Person> findByName(String name);
    List<Person> findByNameAndTckimlik(String name,String tckimlik);
    //Lİke, and, or, orderby, < >

   Optional<Person> findOptionalByTckimlik(String tckimlik);

    //Optional


}
