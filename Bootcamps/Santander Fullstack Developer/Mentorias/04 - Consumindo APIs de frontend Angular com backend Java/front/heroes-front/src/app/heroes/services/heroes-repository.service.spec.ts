import { TestBed } from '@angular/core/testing';

import { HeroesRepositoryService } from './heroes-repository.service';

describe('HeroesRepositoryService', () => {
  let service: HeroesRepositoryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HeroesRepositoryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
