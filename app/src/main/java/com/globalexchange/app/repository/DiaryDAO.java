package com.globalexchange.app.repository;

import com.globalexchange.app.domain.vo.Criteria;
import com.globalexchange.app.domain.vo.DiaryDTO;
import com.globalexchange.app.domain.vo.DiaryVO;
import com.globalexchange.app.mapper.DiaryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DiaryDAO {
  private final DiaryMapper diaryMapper;
  //    추가
  public void save(DiaryDTO diaryDTO){
    diaryMapper.diaryInsert(diaryDTO);
  }
  //    수정
  public void setDiaryVO(DiaryDTO diaryDTO){
    diaryMapper.diaryUpdate(diaryDTO);
  }
  //    삭제
  public void remove(Long boardNumber){
    diaryMapper.diaryDelete(boardNumber);
  }
  //    조회
  public DiaryVO findById(Long boardNumber){
    return diaryMapper.diarySelect(boardNumber);
  }
  //    전체 조회
  public List<DiaryVO> findAll(Criteria criteria){
    return diaryMapper.diarySelectAll(criteria);
  }
  //    전체 개수
  public int findCountAll(){
    return diaryMapper.getTotal();
  }

}
