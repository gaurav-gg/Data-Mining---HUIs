# Data-Mining---HUIs
Data Mining Project focused on improving state of the art data mining algorithms to mine high utility itemsets

Introduction and Literature Review
	
High Utility Itemset (HUI) mining problem involves the use of item utilities to discover profitable itemsets from a transactional database. It considers both internal and external utilities of items to discover profitable itemsets from the database. The problem has received significant attention in the recent years due to its potential applicability in numerous business and scientific applications.
Most of the current works in the literature support only items with positive unit profits. However, in most real-life situations, there is a need to consider items with either positive and negative unit profits or margins. For example, supermarket firms like Walmart often runs hundreds or thousands of cross product promotional campaigns per month. The campaign often involves offering products at everyday low pricing (EDLP), discounted price (that might lead to negative margin) or free products (negative profit) or bundled offerings (mix of discounted and non- discounted products). The additional costs (or losses) incurred on individual items that are part of a promotion are insignificant, if the overall promotional campaign delivers profitable outcomes. In essence, a firm is interested in choosing the bundle of products (or itemsets) that maximize its overall profitability.
An important limitation of traditional HUIM algorithms is that they often produce a huge amount of high-utility itemsets. Hence, it can be very time-consuming for users to analyze the output of these algorithms. Moreover, this makes HUIM algorithms sufferer from long execution times and even fail to run due to huge memory consumption or lack of storage space. To address this issue, it was recently proposed to mine a concise and lossless representation of all HUIs named closed high-utility itemsets (CHUIs). The concept of CHUI extends the concept of closed patterns from FIM. A CHUI is a HUI having no proper supersets that are HUIs and appear in the same number of transactions. This latter representation is interesting since it is lossless (it allows deriving all HUIs). Furthermore, it is also meaningful for real applications since it only discovers the largest HUIs that are common to groups of customers. However, CHUI mining can be very computationally expensive.

To precisely control the output size and discover the itemsets with the highest utilities without setting the thresholds, another promising solution is to redefine the task of mining HUIs as mining top-k high utility itemsets (top-k HUIs). The idea is to let the users specify k, i.e., the number of desired itemsets, instead of specifying the minimum utility threshold. Setting k is more intuitive than setting the threshold because k represents the number of itemsets that the users want to find whereas choosing the threshold depends primarily on database characteristics, which are often unknown to users.



There are two traditional algorithms followed to mine Top-k HUIs which are named TKU (mining Top-K Utility itemsets) and TKO (mining Top-K utility itemsets in One phase). But, these algorithms can only mine items with positive utilities. However, in real life these algorithms cannot be directly applied because they do not consider negative utilities. Therefore, we are proposing an algorithm that can mine Top-k HUIs of items with positive and negative utilities.

Therefore, in this project, two efficient algorithms are presented where one in FHNClosed algorithm which effectively mines Closed High Utility Itemsets (CHUIs) and another one is top-k FHN which mines the top-k HUIs with highest amount of profits. Both the algorithms have different input parameters and therefore different applications in real world. The main challenge faced here is mining items with negative profits as well.


                                                  Problem Statement
	
a)	Closed High Utility Itemsets Mining
Traditional CHUIs mining algorithms only works with positive utility. However, in real life applications, as stated above with examples, negative utilities occur widely. In order to target this issue, we are proposing an algorithm FHNClosed for mining CHUIs with negative utilities. The key adoptions and contributions of this project are as follows:
1.	A vertical list structure called PNU-list is used which maintains all the information required for mining HUIs without performing multiple time-consuming database scans. This list structure is adopted from FHN algorithm.
2.	It adopts a novel sequence closure checking scheme called Bi-Directional Extension, and prunes the search space more deeply compared to the previous algorithms by using the Backward Extension, Forward Extension and closure jumping pruning methods and the Scan-Skip optimization technique adopted from BIDE+ algorithm.
3.	An extensive experimental study is carried on several real-life datasets. Results show that the proposed algorithm outperforms the state-of-the-art algorithms in terms of run- time, memory consumption and scalability.


b)	Top-k High Utility Itemsets Mining

Using a parameter k instead of the minutil threshold is very desirable for many applications. For example, to analyze customer purchase behavior, top-k HUI mining serves as a promising solution for users who desire to know “What are the top-k sets of products (i.e., itemsets) that contribute the highest profits to the company?” and “How to efficiently find these itemsets without setting the minutil threshold?”. Although top-k HUI mining is essential to many applications, developing efficient algorithms for mining such patterns is not an easy task. It poses three major challenges as discussed below.

1.	In traditional HUI mining, the search space can be efficiently pruned by the algorithms by using a given minutil threshold. However, in the scenario of top-k HUI mining, no minutil threshold is provided in advance. Therefore, the minimum utility threshold is initially set to 0 and the designed algorithm has to gradually raise the threshold to prune the search space. 
2.	How to effectively raise the minutil Border threshold without missing any top-k HUIs? A good algorithm is one that can effectively raise the threshold during the mining process. However, if an incorrect method for raising the threshold is used, it may result in some top-k HUIs being pruned. Thus, minutil rising technique of TKO algorithm is used.
3.	Lastly, to mine itemsets with negative utilities, PNU list data structure of FHN algorithm is used.


 
                                                   Conclusion and Scope of Future Work

Conclusion
In this paper, we have studied the problem of mining closed and top-k high utility itemsets from transactional databases with negative unit profits. We have adopted PNU list structure from FHN algorithm and used Bi-directional extension method to mine closed itemsets among the HUIs. We have also adopted minimum utility threshold raising technique from TKO algorithm.

We have also performed an extensive experimental study on real-life datasets to compare the performance of FHNClosed with FHN and found out that FHNClosed outperforms in terms of run-time and number of HUIs. 

Scope of Future Work
•	These algorithms mine High Utility Itemsets, same concepts can be applied to Mining High Utility sequential patterns.
•	Pruning strategies used in GHUI algorithm (A-prune & U-prune) can further be applied which reduces the run-time.
•	PNU list structure is used here which is vertical data structure, using horizontal data structure i.e. Utility tree, may further reduce the run-time.

