(ns sq-in-rect.core) 
;Shaheen Ghazazani - Code Wars problems 2016

;; You will be given two dimensions                                                                                                                                                                 
;;                                                                                                                                                                                                  
;; a positive integer length (parameter named lng)                                                                                                                                                  
;; a positive integer width (parameter named wdth)                                                                                                                                                  
;; You will return an array with the size of each of the squares.                                                                                                                                   
;;                                                                                                                                                                                                  
;; Examples                                                                                                                                                                                         
;;                                                                                                                                                                                                  
;; sqInRect(5, 3) should return [3, 2, 1, 1]                                                                                                                                                        
;; sqInRect(3, 5) should return [3, 2, 1, 1]                                                                                                                                                        
;; Note: lng == wdth as a starting case would be an entirely different problem and the 
;; drawing is planned to be interpreted with lng != wdth. See kata, Square into Squares.
;; Protect trees!.        ;;
;;                                                                                                                                                                                                  
;; When the initial parameters are so that lng == wdth, the solution [lng] would be the most obvious
;; but not in the spirit of this kata so, in that case, return None/nil/null/Nothing/{} with C++. 
;;                                                                                                                                                                                                  
;; Examples:                                                                                                                                                                                        
;;                                                                                                                                                                                                  
;; sqInRect(5, 5) should return nil                                                                                                                                                                 


;;Soln B: 
(defn sq-in-rect [lng wdth]
  (if (not= lng wdth) ;Are we not equal
    (loop [l lng w wdth sqrs [] ] ;recursively loop Length x Width with sqrs as a vector for conjoining
      (if (and (> l 0) (> w 0))
        (cond
          (< l w) (recur l (- w l) (conj sqrs l))
          (< w l) (recur w (- l w) (conj sqrs w))
          (= l w) (recur l (- w ) (conj sqrs l))
          )
        sqrs ; empty catch case [], and returns answer provided right params
        )
      )
    nil ; l == w catch case
    )
  )
