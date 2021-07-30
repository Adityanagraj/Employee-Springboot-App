import streamlit as st
import pandas as pd
from pymongo import MongoClient

def getdata():
	st.title("2K21 Digital Book 👯‍♂️🍹🎊")
	secret_name=""
	password=""
	secret_name=st.text_input("Secret_name")
	password=st.text_input("Password shh!! its secret 🤐")
	st.button("Submit")
	
	


	if secret_name=="ZGVlcGFr"  and password=="YmF0Y2gyMDE3": #deepak
		st.write(''' I am keeping it simple 😅 let's Focus on our Goals Together 👍\n
			#FAANG''' )
	elif secret_name=="a2VlcnRoYW4=" and password=="YmF0Y2gyMDE3":  #keerthan
		st.write("""
			Thanks for Introducing to the world of anime and brilliant coder All the best for future 👍\n
            #NARUTO KI JAI
			""")
	elif secret_name=="Y2hldGhhbg==" and password=="YmF0Y2gyMDE3":  #chethan
		st.write("""
			Great person all the best for all the things you have planned in near future 👍\n
			#PHONEIX
			""")
	elif secret_name=="ZmFyYXo=" and password=="YmF0Y2gyMDE3":  #faraz
		st.write("""
			Remember the days of going somewhere out after internals from days of NaMO vs ? to today 😅 All the best bro for whatever waiting for you future 
			 👍\n
			#RKOT
			""")
	elif secret_name=="amF5c2hhbmthcg==" and password=="YmF0Y2gyMDE3":  #jayshankar
		st.write("""
			learned a lot of things from you in the feild of Coding good Luck for next phase 
			 👍\n
			#WWF
			""")

	elif secret_name=="YWtzaGF5" and password=="YmF0Y2gyMDE3":  #akshay
		st.write("""
			Best friend I got and great helpfull CR from assignment to IA Good luck for next chapter 
			 👍\n
			#CR
			""")
	elif secret_name=="bWFuaXNo" and password=="YmF0Y2gyMDE3":  #manish
		st.write("""
			Real Topper for many reasons always looked upto you all the best for next Run of life
			 👍\n
			#TOPPER
			""")
	elif secret_name=="YWJoaQ==" and password=="YmF0Y2gyMDE3":  #abhi
		st.write("""
			 All the best Abhi will miss all the fun time
			 👍\n
			#GYM BOY
			""")

	elif secret_name=="YW5pbA==" and password=="YmF0Y2gyMDE3":  #anil
		st.write("""
			 Will miss all the fun time in Class and the slang 😅 Keep hustling  All the best!!
			 👍\n
			#HUSTLER
			""")
	elif secret_name=="amFu" and password=="YmF0Y2gyMDE3":  #jan
		st.write("""
			 All your cool tricks with football will be cherished ⚽ All the best for future
			 👍\n
			#CR7
			""")
	elif secret_name=="Y2hhbmRhbg==" and password=="YmF0Y2gyMDE3":  #chandan
		st.write("""
			 Cool person, Teach me some of your English Accent All the best Buddy !!
			 👍\n
			#HACKSTER
			""")
	elif secret_name=="a3VzaGFs" and password=="YmF0Y2gyMDE3":  #kushal
		st.write("""
			 Do not forget give me party👯‍♂️ See you soon as MBA Grad All the best Buddy  !!
			 👍\n
			#RKOB
			""")
	elif secret_name=="bmlzaA==" and password=="YmF0Y2gyMDE3":  #nish
		st.write("""
			 Will miss those punch lines and cricketing Days all the best for future  !!
			 👍\n
			#STUD BOY
			""")
	elif secret_name=="bWFuamE=" and password=="YmF0Y2gyMDE3":  #manja
		st.write("""
			 Always will remember the comedy scence which you used to create in Class all the Best buddy!!
			 👍\n
			#MANJA 
			""")
	elif secret_name=="a2FydGlr" and password=="YmF0Y2gyMDE3":  #kartik
		st.write("""
			 True fan of kiccha All the best bro !!
  			 👍\n
			#KRISKARTIK
			""")
	elif secret_name=="" and password=="":
		st.write("Please enter the valid data 🧐")
	else:
		st.write("I could not find anything with this data 🙈")

	fac_choice = st.sidebar.write("Hey👋, Let's Explore More")
	score=["Enter your details","Memories"]
	score_choice=st.sidebar.selectbox("Lets go whats inside it",score)
	st.sidebar.text("")
	if score_choice=="Enter your details":
		st.sidebar.write("Fill in the details 👉")
	if score_choice=="Memories":
		st.sidebar.video("https://youtu.be/TKfqqjL2AE0")


getdata()

# if __name__ == "__main__": 
# 	main()