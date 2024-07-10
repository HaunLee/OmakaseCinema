<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/globals.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/myPage/myHome.css" />
  </head>
  <body>
    <div class="screen"> 
      <div class="container-wrapper">
        <div class="container">
        <div>
         <jsp:include page="/jsp/footer/footer.jsp"/>
         </div>
          <div class="heading">마이페이지 홈</div>
          <div class="frame">
            <div class="navbar">
               <jsp:include page="/jsp/header/header.jsp"/>
            </div>
          </div>
          <div class="background">
            <div class="overlap">
              <div class="link-6"><div class="text-wrapper-8">마이페이지</div></div>
              <div class="list">
                <div class="overlap-group">
                  <div class="item-link"><div class="text-wrapper-9"><a href="Controller?type=personInfor">개인 정보 수정</a></div></div>
                  <div class="item-link-2"><div class="text-wrapper-10"><a href="Controller?type=myReservation">나의 예매 내역 조회</a></div></div>
                  <div class="link-7"><div class="text-wrapper-11"><a href="Controller?type=inquiry">나의 문의 내역</a></div></div>
                  <div class="item-link-3"><div class="text-wrapper-13"><a href="Controller?type=myHome">마이페이지 홈</a></div></div>
                  <div class="link-8"><div class="text-wrapper-12"><a href="Controller?type=myCoupon">나의 쿠폰 조회</a></div></div>
                </div>
              </div>
            </div>
          </div>
         <div class="horizontal-border">
			  <div class="horizontal-border-2">
			      <div class="frame-2">
			           <a href="Controller?type=myReservation"><button class="more-btn">더보기</button></a>
			          <div class="image"></div>
			      </div>
			      <div class="text-wrapper-16">나의 예매 내역 조회</div>
			  </div>
				  <table>  
				    <tbody>
				    <c:forEach var="item" items="${rvo}" varStatus="status">
				      <tr>
				        <td style="width: 177px"><span class="span">${status.index + 1}</span></td>
				        <td style="width: 622px"><span class="text-wrapper-18">${item.ssvo.mvo.movieNm }</span></td>
				        <td style="width: 173.3px"><div class="text-wrapper-17">${item.rs_time.split(" ")[0]}</div></td>
				      </tr>
				      </c:forEach>
				    </tbody>
				  </table> 
			</div> 
          <div class="horizontal-border-3">
		    <div class="horizontal-border-4">
		        <div class="frame-4">
		            <a href="Controller?type=inquiry"><button class="more-btn">더보기</button></a>
		            <div class="image"></div>
        		</div>
			        <div class="text-wrapper-16">나의 문의내역</div>
			    </div>
				    <table>
				        <tbody>
				        	<c:forEach items="${ivo}" var="vo" varStatus="num"> 
					            <tr>
					                <td><span class="text-wrapper-18">${num.index+1 }</span></td>
					                <td><span class="text-wrapper-18">${vo.iq_title }</span></td>
					                <td><div class="text-wrapper-25">${vo.iq_time.split(" ")[0]}</div></td>
					            </tr>
				            </c:forEach>
				        </tbody>
				    </table>
				</div>
         <div class="overlap-2">
		    <div class="overlap-3">
		        <div class="flexcontainer">
		            <p class="text">
		                <span class="text-wrapper-29">안녕하세요!</span><br />
		            </p>
		            <p class="text"><span class="text-wrapper-29 username">${mvo.u_name}</span> 님</p>
		        </div>
		        <a href="Controller?type=checkPw"><button class="modify-btn">개인정보수정</button></a>
		    	</div>
				    <img class="image-2" src="${pageContext.request.contextPath}/img/myPage/myhome/image-3.png" alt="프로필 이미지" />
				    <div class="overlap-4">
		        	<div class="overlap-5">
		            <div class="text-wrapper-31">쿠폰 현황</div>
  					<a href="${pageContext.request.contextPath}/Controller?type=myCoupon"><img class="polygon" src="${pageContext.request.contextPath}/img/myPage/myhome/polygon-2.svg" alt="아이콘" /></a>
			        	</div>
			        <div class="text-wrapper-32">총 쿠폰</div>
			        <span class="coupon-total">${couponCount }<span>매</span></span>
			        <div class="text-wrapper-34">당월 만료 예정</div>
			        <span class="coupon-expiring">${delCouponCount }<span>매</span></span>
		    </div>
		</div>
  </body>
</html> 
