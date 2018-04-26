Creator	"yFiles"
Version	"2.15"
graph
[
	hierarchic	1
	label	""
	directed	1
	node
	[
		id	0
		label	"a"
		graphics
		[
			x	0.0
			y	75.0
			w	30.0
			h	30.0
			type	"ellipse"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"a"
			fontSize	12
			fontName	"Dialog"
			model	"null"
		]
	]
	node
	[
		id	1
		label	"b"
		graphics
		[
			x	75.0
			y	75.0
			w	30.0
			h	30.0
			type	"ellipse"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"b"
			fontSize	12
			fontName	"Dialog"
			model	"null"
		]
	]
	node
	[
		id	2
		label	"c"
		graphics
		[
			x	225.0
			y	75.0
			w	30.0
			h	30.0
			type	"ellipse"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"c"
			fontSize	12
			fontName	"Dialog"
			model	"null"
		]
	]
	node
	[
		id	3
		label	"d"
		graphics
		[
			x	225.0
			y	0.0
			w	30.0
			h	30.0
			type	"ellipse"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"d"
			fontSize	12
			fontName	"Dialog"
			model	"null"
		]
	]
	node
	[
		id	4
		label	"e"
		graphics
		[
			x	75.0
			y	0.0
			w	30.0
			h	30.0
			type	"ellipse"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"e"
			fontSize	12
			fontName	"Dialog"
			model	"null"
		]
	]
	node
	[
		id	5
		label	"g"
		graphics
		[
			x	0.0
			y	150.0
			w	30.0
			h	30.0
			type	"ellipse"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"g"
			fontSize	12
			fontName	"Dialog"
			model	"null"
		]
	]
	node
	[
		id	6
		label	"f"
		graphics
		[
			x	150.0
			y	75.0
			w	30.0
			h	30.0
			type	"ellipse"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"f"
			fontSize	12
			fontName	"Dialog"
			model	"null"
		]
	]
	edge
	[
		source	0
		target	1
		label	"1"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			xSource	1.0
			xTarget	-1.0
		]
		LabelGraphics
		[
			text	"1"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	11.634765625
			contentHeight	17.96875
			model	"null"
			position	"null"
		]
	]
	edge
	[
		source	1
		target	5
		label	"2"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	75.0
					y	75.0
				]
				point
				[
					x	75.0
					y	150.0
				]
				point
				[
					x	0.0
					y	150.0
				]
			]
		]
		edgeAnchor
		[
			ySource	1.0
			xTarget	1.0
		]
		LabelGraphics
		[
			text	"2"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	11.634765625
			contentHeight	17.96875
			model	"null"
			position	"null"
		]
	]
	edge
	[
		source	2
		target	3
		label	"3"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			ySource	-1.0
			yTarget	1.0
		]
		LabelGraphics
		[
			text	"3"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	11.634765625
			contentHeight	17.96875
			model	"null"
			position	"null"
		]
	]
	edge
	[
		source	1
		target	6
		label	"4"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			xSource	1.0
			xTarget	-1.0
		]
		LabelGraphics
		[
			text	"4"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	11.634765625
			contentHeight	17.96875
			model	"null"
			position	"null"
		]
	]
	edge
	[
		source	0
		target	5
		label	"5"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			ySource	1.0
			yTarget	-1.0
		]
		LabelGraphics
		[
			text	"5"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	11.634765625
			contentHeight	17.96875
			model	"null"
			position	"null"
		]
	]
	edge
	[
		source	4
		target	1
		label	"6"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			ySource	1.0
			yTarget	-1.0
		]
		LabelGraphics
		[
			text	"6"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	11.634765625
			contentHeight	17.96875
			model	"null"
			position	"null"
		]
	]
]
