package com.skilldistillery.dao;

import java.util.List;

import com.skilldistillery.film.entities.Actor;
import com.skilldistillery.film.entities.Film;


public interface DatabaseAccessor {
	  public Film findFilmById(int filmId);
	  public Actor findActorById(int actorId);
	  public List<Actor> findActorsByFilmId(int filmId);
	  public List<Film> findFilmBySearchWord(String keyword);
	  public String getLanguage(int filmId);
	  public Film createFilm(Film film);
	  public boolean deleteFilm(Film film);
	}

