package com.example.chatgpt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter (
    var messageList:List<Message>
):RecyclerView.Adapter<MessageAdapter.MessageViewHolder>()
{
    inner class MessageViewHolder(var v:View):RecyclerView.ViewHolder(v){
        val leftChatView = v.findViewById<LinearLayout>(R.id.left_chat)
        val leftTextView = v.findViewById<TextView>(R.id.left_chat_text)
        val rightChatView = v.findViewById<LinearLayout>(R.id.right_chat)
        val rightTextView = v.findViewById<TextView>(R.id.right_chat_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val chatView = LayoutInflater.from(parent.context).inflate(R.layout.chat_item,parent,false)
        return MessageViewHolder(chatView)
    }

    override fun getItemCount(): Int = messageList.size

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messageList[position]
        if (message.sentBy == Message.SENT_BY_ME){
            holder.leftChatView.visibility = View.GONE
            holder.rightChatView.visibility = View.VISIBLE
            holder.rightTextView.text = message.message
        }else{
            holder.leftChatView.visibility = View.VISIBLE
            holder.rightChatView.visibility = View.GONE
            holder.leftTextView.text = message.message
        }
    }
}














